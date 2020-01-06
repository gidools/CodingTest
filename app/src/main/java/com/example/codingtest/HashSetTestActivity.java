package com.example.codingtest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;

public class HashSetTestActivity extends AppCompatActivity {

	private class Person {
		private String name;
		private int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HashSet<Person> personHashSet = new HashSet<>();
		personHashSet.add(new Person("Alice", 30));
		personHashSet.add(new Person("Alice", 30));

		Log.d("HashSetTestActivity", "HashSet size : " + personHashSet.size());
	}
}
