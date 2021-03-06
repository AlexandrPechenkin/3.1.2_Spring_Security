package ru.kata.spring.boot_security.demo.Dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleDao {
    Role getOne(long id);
    List<Role> getAll();
    HashSet<Role> getSetOfRoles(long[] roleId);
}