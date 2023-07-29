package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    abstract boolean theSameAs (T type);
    public boolean isEquals (Object object);
}
