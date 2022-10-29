package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;


/*
 * List - Index
 * Set - No duplicate
 * Map - Key - Value pair
 * 
 * Java Collection Framework Mainly has
 *                           Collection(I)
 *                                |
 *            -----------------------------------------
 *            |                   |                   |
 *     List(I)                   Set(I)              Queue(I)
 *     
 *                            Map(I)
 *                            
 *   These are the Main Interfaces, and There are Classes implementing these interfaces
 *   
 *   Collections is present in java.util package
 *   
 *   Below listed is the all the abstract methods present in each Interfaces
 *   
 *   just go through them
 *   
 * 
 */

class ListEx implements List{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class SetEx implements Set{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}


class QueueEx implements Queue{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class MapEx implements Map{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class CollectionsEx {
	
	
	
	public static void main(String[] args) {
		//Implementing classes of List 
		ArrayList<String> al=new ArrayList<String>();
		Vector<String> v=new Vector<String>();
		LinkedList<String> ll=new LinkedList<String>();
		
		//Arraylist
		System.out.println("The size of the Array list "+al.size());
		System.out.println("Adding one element");
		al.add("Vinod");
		System.out.println("The size of the Array list "+al.size());
		System.out.println("Adding one element");
		al.add("Priyanka");
		System.out.println("The size of the Array list "+al.size());
		System.out.println("Adding one element");
		al.add("chandru");
		System.out.println("The size of the Array list "+al.size());
		System.out.println("Adding one element");
		al.add("Aparna");
		System.out.println("The size of the Array list "+al.size());
		
		System.out.println("Accessing using index");
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("-----------------");
		System.out.println("Accessing using For each loop");
		
		for(String s1:al){
			System.out.println(s1);
		}
		
		System.out.println("-----------------");
		System.out.println("Accessing using Iterator");
		
		Iterator<String> i1 = al.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
	
	
	//LinkedList
			System.out.println("The size of the Array list "+ll.size());
			System.out.println("Adding one element");
			ll.add("Vinod");
			System.out.println("The size of the Array list "+ll.size());
			System.out.println("Adding one element");
			ll.add("Priyanka");
			System.out.println("The size of the Array list "+ll.size());
			System.out.println("Adding one element");
			ll.add("chandru");
			System.out.println("The size of the Array list "+ll.size());
			System.out.println("Adding one element");
			ll.add("Aparna");
			System.out.println("The size of the Array list "+ll.size());
			
			System.out.println("Accessing using index");
			
			for(int i=0;i<ll.size();i++){
				System.out.println(ll.get(i));
			}
			
			System.out.println("-----------------");
			System.out.println("Accessing using For each loop");
			
			for(String s2:ll){
				System.out.println(s2);
			}
			
			System.out.println("-----------------");
			System.out.println("Accessing using Iterator");
			
			Iterator<String> i2 = ll.iterator();
			while(i2.hasNext()){
				System.out.println(i2.next());
			}
			


			//Vector
			System.out.println("The size of the Array list "+v.size());
			System.out.println("Adding one element");
			v.add("Vinod");
			System.out.println("The size of the Array list "+v.size());
			System.out.println("Adding one element");
			v.add("Priyanka");
			System.out.println("The size of the Array list "+v.size());
			System.out.println("Adding one element");
			v.add("chandru");
			System.out.println("The size of the Array list "+v.size());
			System.out.println("Adding one element");
			v.add("Aparna");
			System.out.println("The size of the Array list "+v.size());
			
			System.out.println("Accessing using index");
			
			for(int i=0;i<v.size();i++){
				System.out.println(v.get(i));
			}
			
			System.out.println("-----------------");
			System.out.println("Accessing using For each loop");
			
			for(String s3:v){
				System.out.println(s3);
			}
			
			System.out.println("-----------------");
			System.out.println("Accessing using Iterator");
			
			Iterator<String> i3 = v.iterator();
			while(i3.hasNext()){
				System.out.println(i3.next());
			}
			
	}


}
