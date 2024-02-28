package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj); // responsavel por inserir ao banco de dados o obj department
    void update(Department obj); // responsavel por adicionar os id e relacionar com os departamentos
    void deleteById(Integer id); // deleta o id
    Department findById(Integer id); //Operaçao-> responsavel por consultar na tabela a existencia de determinado ID
    List<Department> findAll(); // operaçao responsavel por retornar todos os departamentos

}
