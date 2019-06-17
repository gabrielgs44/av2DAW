package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String sexoString = request.getParameter("sexo");
        String pais = request.getParameter("pais");
        char sexo = sexoString.charAt(0);

        Personagem perso = new Personagem(nome, pais, sexo);

        int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
        int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
        int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
        int socoForte = Integer.parseInt(request.getParameter("socoForte"));

        Golpe golpe = new Golpe(socoFraco, socoForte, chuteFraco, chuteForte);

        String magia = request.getParameter("magia");
        String descricao = request.getParameter("descricao");
        int potencia = Integer.parseInt(request.getParameter("potencia"));

        Magia mag = new Magia(magia, descricao, potencia);
        
        RequestDispatcher desp = request.getRequestDispatcher("confirmacao.jsp");
        desp.forward(request, response);
	    
	}

}
