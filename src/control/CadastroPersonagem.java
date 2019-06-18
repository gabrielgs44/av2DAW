package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DaoPersonagem;
import model.Golpe;
import model.Magia;
import model.Personagem;

@WebServlet("/CadastroPersonagem")
public class CadastroPersonagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String nome = request.getParameter("nome");
	    char sexo = request.getParameter("sexo").charAt(0);
	    String pais = request.getParameter("pais");
        
	    Personagem perso = new Personagem(nome, pais, sexo);
	    
	    int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
	    int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
	    int socoForte = Integer.parseInt(request.getParameter("socoForte"));
	    int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
	    
	    Golpe golpe = new Golpe(chuteForte, chuteFraco, socoForte, socoFraco);
	    
	    String nomeMagia = request.getParameter("magia");
        String descricao = request.getParameter("descricao");
        int potencia = Integer.parseInt(request.getParameter("potencia"));
        
        Magia mag = new Magia(nomeMagia, descricao, potencia);
	    
        DaoPersonagem daoPerso = new DaoPersonagem();
        daoPerso.cadastrar(perso, mag, golpe);
        
        RequestDispatcher desp = request.getRequestDispatcher("confirmacao.jsp");
        desp.forward(request, response);
	    
	}

}
