package com.codepresso.todo.controller;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    TodoService todoService;

    //TodoService 의존성 주입
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //Get 요청 시 TodoList 반환
    @GetMapping
    public List<Todo> getTodoList() {
        List<Todo> list = todoService.getTodoList();
        return list;
    }

    //Post 요청 시 TodoList 항목 추가
    //RequestBody 데이터 저장
    //성공 시 결과값 200과 성공 메시지 리턴
    @PostMapping
    public ResultDto addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return new ResultDto(200, "Success");
    }

    //Delete 요청 시 TodoList 항목 삭제
    //PathParameter 해당하는 데이터 삭제
    //성공 시 결과값 200과 성공 메시지 리턴
    @DeleteMapping("/{id}")
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        return new ResultDto(200, "Success");
    }
}
