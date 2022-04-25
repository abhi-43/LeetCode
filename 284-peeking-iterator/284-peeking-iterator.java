// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer peek;
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator=iterator;
        if(iterator.hasNext()){
            peek=iterator.next();
        }
	    
	}
	
	public Integer peek() {
        return peek;
	}
	
	@Override
	public Integer next() {
	    Integer next = peek;
        if(iterator.hasNext()){
            peek=iterator.next();
        }else{
            peek=null;
        }
        return next;
	}
	
	@Override
	public boolean hasNext() {
	    return peek!=null;
	}
}