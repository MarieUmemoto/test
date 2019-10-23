package original;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGu
 */
@WebServlet("/GuGu")
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuGu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String janken = request.getParameter("janken");
		//System.out.println(janken);
		Janken jk = new Janken();
		jk.setJanken(janken);

		JankenLogic JL = new JankenLogic();
		JL.execute(jk.getJanken());
		jk.setMuraoJanken(JL.getMuraoJanken());
		jk.setResult(JL.getResult());
		//HttpSession session = request.getSession();session.setAttribute("jk", jk);
		request.setAttribute("jk", jk);

		//フォワード
		RequestDispatcher dis =
				request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dis.forward(request, response);

	}

}