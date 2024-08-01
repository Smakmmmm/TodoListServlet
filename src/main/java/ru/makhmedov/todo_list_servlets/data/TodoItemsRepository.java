package ru.makhmedov.todo_list_servlets.data;

import java.util.List;

public interface TodoItemsRepository {
    List<TodoItem> getAll();

    void create(TodoItem item);

    void update(TodoItem item);

    void delete(int itemId);
}
