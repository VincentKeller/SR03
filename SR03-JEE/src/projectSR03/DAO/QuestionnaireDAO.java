package projectSR03.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectSR03.beans.QuestionnaireBean;

public class QuestionnaireDAO {
	
	/**
	 * Fonction pour obtenir la liste des questionnaires pr�sents en base
	 * @return ArrayList<QuestionnaireBean> contenant la liste des Questionnaires
	 */
	public static ArrayList<QuestionnaireBean> getQuestionnaires() {
		
		Connection conn = MysqljdbcDAO.mySQLgetConnection();
		PreparedStatement preparedStatement = null;
		ResultSet result = null;
		ArrayList<QuestionnaireBean> questionnaires =new ArrayList<QuestionnaireBean>();
		
		try {
			preparedStatement = conn.prepareStatement( "SELECT Id, Name, CreationDate FROM Questionnaire;" );
			
			result = InteractionsDAO.mySQLreadingQuery(conn, preparedStatement);

			while(result.next()) {
			   QuestionnaireBean questionnaire = new QuestionnaireBean();      
			   questionnaire.setId(result.getInt("Id"));
			   questionnaire.setName(result.getString("Name"));
			   questionnaire.setDateCreation(result.getDate("CreationDate"));
			   questionnaires.add(questionnaire);
			}
			
		} 
		catch (SQLException e) {
			return null;
		}
		finally {
			MysqljdbcDAO.closeConnection(result, preparedStatement, conn);				
		}
		
		
		return questionnaires;
	}
}