
public class SinglyLinkedList {
public class SinglyLinkedList {
 private static Listnode head;
 public static class Listnode {
	 private int data;
	 private Listnode next;
	 public Listnode(int data) {
		 this.data=data;
		 this.next=null;
		 }
 }

public void createlist(Listnode head2) {
	 head=new Listnode(1);
	 Listnode second=new Listnode(2);
	 Listnode third=new Listnode(4);
	 Listnode forth=new Listnode(6);
	 Listnode fifth=new Listnode(3);
	 head.next=second;
	 second.next=third;
	 third.next=forth;
	 forth.next=fifth;
        }
 public void printnodes() {
	 Listnode current=head;
	 while(current!=null) {
		 System.out.print(current.data+ "-->");
		 current=current.next;
	 }
	 System.out.print("null");
 }
     public void insertfirst(int value) {
    	 Listnode newnode =new Listnode(value);
    	 newnode.next=head;
    	 head=newnode;
    	 }
  public void insertlast(int value) {
	  Listnode newnode=new Listnode(value);
	  if(head==null) {
		  head=newnode;
		  return;
	  }
	  Listnode current=head;
	  while(current.next!=null) {
		  current=current.next;
	  }
	  current.next=newnode;
  }
    public Listnode deletefirst() {
    	if(head==null) {
    		return null;
    	}       
    	Listnode temp=head;
    head=head.next;
    temp.next=null;
    return temp;
    }
     public Listnode reverselist() {
    	 Listnode current=head;
    	 Listnode previous=null;
    	 Listnode next=null;
    	 while(current!=null) {
    		 next=current.next;
    		 current.next=previous;
    		 previous=current;
    		 current=next;
    	 }
    	 return previous;
     }
      public Listnode middlenode() {
    	  if(head==null) {
    		  return null;
    	  }
    	  Listnode slowptr=head;
    	  Listnode fastptr=head;
    	  while(fastptr!=null && fastptr.next!=null) {
    		  slowptr=slowptr.next;
    		  fastptr=fastptr.next.next;
    	  }
    	  return slowptr;
      }
    public void removeduplicates() {
    	Listnode current=head;
    	while(current!=null&&current.next!=null) {
    		if(current.data==current.next.data) {
    			current.next=current.next.next;
    		}
    		else {
    			current=current.next;
    		}
    	}
    }
    
     public void Detectloop() {
    	 Listnode fastptr=head;
    	 Listnode slowptr=head;
    	 while(fastptr!=null  && fastptr.next!=null) {
    		  
    		 fastptr=fastptr.next.next;
    		 slowptr=slowptr.next;
    		 if(slowptr==fastptr) {
    			 removeloop(slowptr);
    			 return;
    		 }
    	 }
	 
    	 
     }
     
     public void removeloop(Listnode slowptr) {
    	 Listnode temp=head;
    	  
    	 while(slowptr.next!=temp.next) {
    		 temp=temp.next;
    		 slowptr=slowptr.next.next;
    		 
    	 }
    	 slowptr.next=null;
     }
     public void deletenth(Listnode head,int n) {
    	 Listnode current=head;
    	 int count=0;
    	 while(current!=null) {
    		 count++;
    		 current=current.next;
    	 }
    	 Listnode previous=head;
    	 int temp=1;
    	 while(temp<count-n) {
    		 temp++; 
    		 previous=previous.next;
    		     	 
    		 }
    	 previous.next=previous.next.next;
     }
     public void insertatgivenpos(int value,int position) {
    	 Listnode newnode=new Listnode(value);
    	 if(position==1) {
    		 newnode.next=head;
    		 head=newnode;
    		 }
    	 else {
    		 Listnode previous =head;
    		 int count=1;
    		 while(count<position-1) {
    			 previous=previous.next;
    			 count++;
    		 }
    		 Listnode current=previous.next;
    		 newnode.next=current;
    		 previous.next=newnode;
    	 }
    	 }
    	 public void deleteatgivenpos(int position) {
        	  
        	 if(position==1) {
        		 Listnode temp=head;
        	 
        		 head=head.next;
        		 temp.next=null;
        		 
        		 }
        	 else {
        		 Listnode previous =head;
        		 int count=1;
        		 while(count<position-1) {
        			 previous=previous.next;
        			 count++;
        		 }
        		 previous.next=previous.next.next;
        		  
        	 }
     }
     public static void main(String[]args) {
	 SinglyLinkedList m1=new SinglyLinkedList();
	 
   m1.createlist(head);
   m1.deleteatgivenpos(3);
  m1.printnodes();
 }
}

}
