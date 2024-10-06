package com.project.chessengine;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController{@GetMapping("path")
    @RequestMapping("/")
    public String test() {
        return "Hey there, Welcome to Project: Chess Engine by the Jobless Devs";
    }
    @RequestMapping("/board")
    public String printBoard() {
        ChessBoard board = new ChessBoard();
        
        return board.printBoardWeb();
    }
}