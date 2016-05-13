package co.runcode.bo;

import java.util.List;

public interface CrudBO<T> {

    public T add(T entity);
        
    public void edit(T entity);

    public void remove(T entity);

    public T find(Object id);
    
    public List<T> findAll();
    
    public List<T> findRange(int[] range);
    
    public int count();
    
}
