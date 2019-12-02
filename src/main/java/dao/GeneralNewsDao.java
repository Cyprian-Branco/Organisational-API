package dao;

import models.GeneralNews;

import java.util.List;

public interface GeneralNewsDao {
    void add(GeneralNews generalNews);

    List<GeneralNews> getAll();

    void deleteById(int id);

    void clearAll();
}
