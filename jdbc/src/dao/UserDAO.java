package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import vo.UserVO;

public class UserDAO {
   
   private final int KEY = 3;
   
   public Connection connection; //연결 객체
   public PreparedStatement preparedStatement; //쿼리(SQL문) 객체
   public ResultSet resultSet; //결과 테이블 객체
   
//   아이디 중복검사
   public boolean checkId(String id) {
//      USER_ID 컬럼에서 사용자가 입력한 id 검사
      String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_ID = ?";
      boolean check = false;
      try {
//         연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         작성한 쿼리문을 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ? 채우기(좌에서 우로 1부터 1씩 증가)
         preparedStatement.setString(1, id);
//         쿼리 실행
         resultSet = preparedStatement.executeQuery();
//         결과 행 1개 가져오기
         resultSet.next();
//         결과 첫번째 열 1개 가져오기
//         1이라면 사용자가 입력한 아이디가 1개 조회된 것이기 때문에 중복된 아이디이다.
         check = resultSet.getInt(1) == 1;
         
      } catch (SQLException e) {
         System.out.println("checkId()에서 쿼리문 오류");
      } finally {
         try {
//            연결 객체 모두 닫기
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      
      return check;
   }
//   회원가입
   
   public void insert(UserVO userVO) {
//	   user테이블에 컬럼별로 값 인서트
      String query = "INSERT INTO TBL_USER "
            + "(USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB)"
            + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         작성한 쿼리문을 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 좌에서 우로 1씩 증가
         preparedStatement.setString(1, userVO.getUserId());
         preparedStatement.setString(2, userVO.getUserName());
         preparedStatement.setString(3, userVO.getUserPassword());
         preparedStatement.setString(4, userVO.getUserPhone());
         preparedStatement.setString(5, userVO.getUserNickname());
         preparedStatement.setString(6, userVO.getUserEmail());
         preparedStatement.setString(7, userVO.getUserAddress());
         preparedStatement.setString(8, userVO.getUserBirthDate());
         preparedStatement.setString(9, userVO.getUserGender());
         preparedStatement.setString(10, userVO.getUserRecommenderId());
         preparedStatement.setString(11, userVO.getUserJob());
//         업데이트 실행
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println(e);
         System.out.println("insert()에서 쿼리문 오류");
//         연결 된 순서랑 반대로 진행 
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   로그인
   
   public int login(String userId, String userPassword) {
//	   user테이블에서 id,password 조회 
      String query = "SELECT USER_NUMBER FROM TBL_USER WHERE USER_ID = ? AND USER_PASSWORD = ?";
//      회원번호 초기화 
      int userNumber = 0;
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         작성한 쿼리문 preparedStateMent에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setString(1, userId);
         preparedStatement.setString(2, userPassword);
//         쿼리 실행 
         resultSet = preparedStatement.executeQuery();
//         결과 행 1개 가젹오기
         if(resultSet.next()) {
//        	 USER_NUMBER열 가져와서 userNumber에 저장  
            userNumber = resultSet.getInt("USER_NUMBER");
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("login() 쿼리문 오류");
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userNumber;
   }
//   암호화
   public String encrypt(String password) {
      String encryptedPassword = "";
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      return encryptedPassword;
   }
   
//   회원탈퇴
   public void delete(int userNumber) {
//	   user테이블에서 회원번호 삭제 
      String query = "DELETE FROM TBL_USER WHERE USER_NUMBER = ?";
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리문 preparedStatement에 전달하기 
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setInt(1, userNumber);
//         쿼리문 실행 (select는 executeQuery / update나insert,delete는 executeUpdate)
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("delete() 쿼리문 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   아이디 찾기
   public String findId(String userPhone) {
//	   userId null로 초기화 
      String userId = null;
//      user테이블에서 핸트폰번호 검색 
      String query = "SELECT USER_ID FROM TBL_USER WHERE USER_PHONE = ?";
      try {
//    	  연결된 객체 가져오기 
         connection = DBConnecter.getConnection();
//         쿼리를 preparedStatuement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기
         preparedStatement.setString(1, userPhone);
//         쿼리 실행하기
         resultSet = preparedStatement.executeQuery();
//         결과 행 1개 가져오기
         if(resultSet.next()) {
//        	 userId에 결과 열 1개 저장하기 
            userId = resultSet.getString(1);
         }
         
      } catch (SQLException e) {
         System.out.println("findId() 쿼리문 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userId;
   }
   
//   비밀번호 변경
   public void updateUserPassword(String userId, String userPassword) {
//	   user테이블에 password,id업데이트
      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";
      try {
//    	  연결된 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리를 preparedStatement에 전달하기
         preparedStatement = connection.prepareStatement(query);
//         ?채우기
         preparedStatement.setString(1, userPassword);
         preparedStatement.setString(2, userId);
//         쿼리 실행
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("updateUserPassword() 쿼리 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   회원정보 수정
   public void update(UserVO userVO) {
//	   user테이블에서 회원 정보 수정
      String query = "UPDATE TBL_USER "
            + "SET USER_NAME=?, USER_PASSWORD=?, USER_PHONE=?, USER_NICKNAME=?, USER_ADDRESS=?, USER_BIRTH_DATE=?, USER_GENDER=? , USER_RECOMMENDER_ID=?, USER_JOB=?"
            + "WHERE USER_NUMBER = ?";
      
      try {
//    	  연결된 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리문 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기
         preparedStatement.setString(1, userVO.getUserName());
         preparedStatement.setString(2, userVO.getUserPassword());
         preparedStatement.setString(3, userVO.getUserPhone());
         preparedStatement.setString(4, userVO.getUserNickname());
         preparedStatement.setString(5, userVO.getUserAddress());
         preparedStatement.setString(6, userVO.getUserBirthDate());
         preparedStatement.setString(7, userVO.getUserGender());
         preparedStatement.setString(8, userVO.getUserRecommenderId());
         preparedStatement.setString(9, userVO.getUserJob());
         preparedStatement.setInt(10, userVO.getUserNumber());
//         쿼리문 실행 
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("update() 쿼리 오류");
         e.printStackTrace();
      }finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   회원정보 조회
   public UserVO selectUser(int userNumber) {
//	   user테이블에서 회원 정보 조회
      String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB FROM TBL_USER "
            + "WHERE USER_NUMBER = ?";
//      date초기화
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 
      int i = 0;
      UserVO userVO = new UserVO();
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리문 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setInt(1, userNumber);
//         쿼리문 실행
         resultSet = preparedStatement.executeQuery();
//         결과 행 1개 가져오기 
         resultSet.next();
         
         userVO.setUserNumber(resultSet.getInt(++i));
         userVO.setUserId(resultSet.getString(++i));
         userVO.setUserName(resultSet.getString(++i));
         userVO.setUserPassword(resultSet.getString(++i));
         userVO.setUserPhone(resultSet.getString(++i));
         userVO.setUserNickname(resultSet.getString(++i));
         userVO.setUserEmail(resultSet.getString(++i));
         userVO.setUserAddress(resultSet.getString(++i));
         try {userVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));}
         catch (Exception e) {;}
         userVO.setUserGender(resultSet.getString(++i));
         userVO.setUserRecommenderId(resultSet.getString(++i));
         userVO.setUserJob(resultSet.getString(++i));
         
      } catch (SQLException e) {
         System.out.println("updateUser() 쿼리문 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userVO;
   }
   
   
//   추천수
   	public int getTotalOfRecommender(String userId) {
//	   user테이블에서 추천인 아이디 검색
      String query = "SELECT COUNT(USER_RECOMMENDER_ID) FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
//      count초기화
      int count = 0;
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리를 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setString(1, userId);
//         쿼리문 실행
         resultSet = preparedStatement.executeQuery();
//         결과를 행에서 1개 가져오기
         if(resultSet.next()) {
//        	 결과를 열에서 1개 가져온 값을 count에 저장
            count = resultSet.getInt(1);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return count;
   }
   
//   나를 추천한 사람
//   list 타입으로 return받음 (여러명이기 떄문)
   public ArrayList<UserVO> selectRecommenders(String userId){
//	   user테이블에서 회원정보 조회
      String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB FROM TBL_USER "
            + "WHERE USER_RECOMMENDER_ID = ?";
//      recommenders라는 list 생성 초기화
      ArrayList<UserVO> recommenders = new ArrayList<>();
//      date 초기화 
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      int i = 0;
      try {
//    	  연결 객체 가져오기
         connection = DBConnecter.getConnection();
//         쿼리 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setString(1, userId);
//         쿼리 실행 
         resultSet = preparedStatement.executeQuery();
         
//         결과를 행에서 1개 가져옴 (true면 계속 반복)
         while(resultSet.next()) {
//        	 i 초기화
            i = 0;
            UserVO userVO = new UserVO();
            userVO.setUserNumber(resultSet.getInt(++i));
            userVO.setUserId(resultSet.getString(++i));
            userVO.setUserName(resultSet.getString(++i));
            userVO.setUserPassword(resultSet.getString(++i));
            userVO.setUserPhone(resultSet.getString(++i));
            userVO.setUserNickname(resultSet.getString(++i));
            userVO.setUserEmail(resultSet.getString(++i));
            userVO.setUserAddress(resultSet.getString(++i));
            try {userVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));}
            catch (Exception e) {;}
            userVO.setUserGender(resultSet.getString(++i));
            userVO.setUserRecommenderId(resultSet.getString(++i));
            userVO.setUserJob(resultSet.getString(++i));
            
            recommenders.add(userVO);
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return recommenders;
   }
//   내가 추천한 사람
   public UserVO getMyRecommender(String userId) {
//	   user 테이블에서 user_id가 추천한 정보 조회
      String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB " +
            "FROM TBL_USER WHERE USER_ID = " + 
            "(" +
               "SELECT USER_RECOMMENDER_ID FROM TBL_USER " + 
               "WHERE USER_ID = ?" +
            ")";
//      date 초기화 
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      UserVO userVO = new UserVO();

      int i = 0;
      try {
//    	  연결 객체 가져오기 
         connection = DBConnecter.getConnection();
//         쿼리 preparedStatement에 전달
         preparedStatement = connection.prepareStatement(query);
//         ?채우기 
         preparedStatement.setString(1, userId);
//         쿼리 실행
         resultSet = preparedStatement.executeQuery();
         
//         결과 행에 1개 가져오기
         if(resultSet.next()) {
            userVO.setUserNumber(resultSet.getInt(++i));
            userVO.setUserId(resultSet.getString(++i));
            userVO.setUserName(resultSet.getString(++i));
            userVO.setUserPassword(resultSet.getString(++i));
            userVO.setUserPhone(resultSet.getString(++i));
            userVO.setUserNickname(resultSet.getString(++i));
            userVO.setUserEmail(resultSet.getString(++i));
            userVO.setUserAddress(resultSet.getString(++i));
            try {userVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));} 
            catch (Exception e) {;}
            userVO.setUserGender(resultSet.getString(++i));
            userVO.setUserRecommenderId(resultSet.getString(++i));
            userVO.setUserJob(resultSet.getString(++i));
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userVO;
   }
}


















