package com.codepresso.todo.service;

import com.codepresso.todo.vo.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private List<Todo> todoList;

    //멤버변수 todoList에 의존성 주입
    public TodoService(List<Todo> todoList) {
        this.todoList = todoList;
    }

    //todoList 정보 반환
    public List<Todo> getTodoList() {
        return todoList;
    }

    //todoList 항목 추가
    public void addTodo(Todo todo) {
        todo.setId(todoList.size()); //todoList 항목 아이디 세팅
        todoList.add(todo);
    }

    //todoList 항목 삭제
    public void deleteTodo(int index) {
        todoList.remove(index);
    }
}
