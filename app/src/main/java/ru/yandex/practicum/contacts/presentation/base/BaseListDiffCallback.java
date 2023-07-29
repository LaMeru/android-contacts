package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface<BaseListDiffCallback>> extends DiffUtil.ItemCallback<S>{

    @Override
    public boolean theSameAs ( T oldItem, T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(T oldItem, T newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(T oldItem, T newItem) {
        return newItem;
    }
}
