package inventorymanagement.dao;

import java.util.List;

import inventorymanagement.entities.Request;

public interface RequestDaoInterface {

  public void save(Request request);

  public void update(Request request);

  public List<Request> getAll();

  public Request getById(int id);

  public void refresh(Request request);

  List<Request> getByUserId(int id);

}
