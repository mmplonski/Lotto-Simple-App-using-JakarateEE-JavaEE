package com.example.Symulator_Lotto_JEE;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/lotto")
public class LottoController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Integer> userNumbers = getNumbers(req);
        List<Integer> drawdNumbers = Lotto.getRandomNumbers();
        List<Integer> winingNumbers = Lotto.getCommonElements(drawdNumbers,userNumbers);
        LottoResult lottoResult = new LottoResult(userNumbers,drawdNumbers,winingNumbers);
        req.setAttribute("lottoResult",lottoResult);
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }

    private List<Integer> getNumbers(HttpServletRequest request){
        String[] numbers = request.getParameterValues("numbers");
        return Arrays.stream(numbers)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
