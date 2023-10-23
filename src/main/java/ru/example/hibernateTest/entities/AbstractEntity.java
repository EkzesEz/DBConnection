package ru.example.hibernateTest.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEntity<T> {
	private String name;
}
