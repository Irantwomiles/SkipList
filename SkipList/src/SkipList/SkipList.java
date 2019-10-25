package SkipList;

public class SkipList implements SkipList_Interface {
  SkipList_Node head;
  SkipList_Node tail;
  int level;
  int size;
  static final int levelSize = 100;
  double probability = 0.5;
  
  SkipList() {
    head = new SkipList_Node(null, levelSize);
    tail = new SkipList_Node(null, levelSize);

    for (int i = 1; i <= levelSize; i++) {
      head.setForward(i, tail);
    }

    level = 0;
    size = 0;
  }
  
  @Override
  //used for testing, please leave as is
  public SkipList_Node getHead() {
    if (size == 0)
      return null;

    return head;
  }

  //use this when creaing a new node, please leave as is
  public int randomLevel() {
    int level = 1;

    while (Math.random() < probability)
      level++;

    return level;
  }

@Override
public boolean insert(String s) {
	if(size == 0) {
		level = randomLevel();
		SkipList_Node temp = new SkipList_Node(s, level);
		
		size++;
	}
	
	return false;
}

@Override
public boolean remove(String s) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String findMin() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String findMax() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean empty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean contains(String s) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int level() {
	// TODO Auto-generated method stub
	return 0;
}

}