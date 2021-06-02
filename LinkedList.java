
public class LinkedList {

	Node head;
	
	
	public LinkedList()
	{
		head=null;
		System.out.println();
	}
	
	public LinkedList(LinkedList l1) {
		this.head=null;
		Node it=l1.head;
		while(it!=null)
		{
			this.append(it.getData());
			it=it.next;
		}
	}



	public void insert(int data)
	{
		Node nn=new Node(data);
		
			nn.next=head; //nn.setNext(head);
			head=nn;
                 System.out.println();
		
	}
	
	public void append(int data)
	{
		Node nn =new Node(data);
		
		if(head==null)
		{
			head=nn;
			
		}
		else {
		Node it=head;
		
		while(it.next!=null)
		{
			it=it.next;
		}
		it.next=nn;
		}
	}
	
	public void insertByPos(int value,int pos)
	{
		if(pos==1)
		{
			insert(value);
		}
		else 
		{
			Node it=head;
			int i=1;
			while(pos-1!=i && it!=null)
			{
				it=it.next;
				i++;	
			}
			
			if(pos-1==i &&it!=null)
			{
				Node nn=new Node(value);
				nn.next=it.next;
				it.next=nn;
			}
			else
			{
				System.out.println("invalid position");
			}
		}
		
	}
	
	public void deleteByPos(int pos)
	{
		if(pos==1)
		{
			deleteFirst();
		}
		else
		{
			Node it=head;
			int i=1;
			while(pos-1!=i && it.next!=null)
			{
				it=it.next;
				i++;
			}
			
			if(pos-1==i && it.next!=null && i>1)
			{
				Node temp=it.next;
				it.next=temp.next;
				temp=null;
			}
			else
			{
				System.out.println("Invalid Position");
			}
		}
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node temp=head;
			head=temp.next;
			
		}		
	}
	
	public void deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				Node it=head;
				while(it.next.next!=null)
				{
					it=it.next;
				}
				it.next=null;
	
			/*	
				Node it=head;
				Node temp=head;
				
				while(it.next!=null)
				{
					it=it.next;
					if(it.next!=null)
					temp=temp.next;
				}
				temp.next=null;
				it=null;// this will end the last link with node, now gc will delete the node
			*/
			}
			}
		}

	
	@Override
	public String toString() {
		
		String str="";
		if(isEmpty())
		{
			str="List is Empty";
		}
		else
		{
			/*
			Node it=head;
			while(it!=null)
			{
				System.out.println(it.data+ "->");
				it=it.next;
			}*/
			
			for(Node it=head;it!=null;it=it.getNext())
			{
				str=str+it.getData()+ "->";
			}
		}
		return str;
	}
	

	private boolean isEmpty() {
		
		return head==null;
	}

	public void reverse() {
		
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		else
		{
			Node itn=head;
			Node it=head;
			Node itp=null;
			
			while(it!=null)
			{
				itn=it.next;
				it.next=itp;
				itp=it;
				it=itn;
			}
			head=itp;
		}
	}

	public void reversePrint(Node it)
	{
		if(it==null)
		{
			System.out.println("LL is Empty");
		}
		else
		{
			Node itp=it;
			if(it.next!=null)
			{
				reversePrint(it.next);
			}
			
			System.out.print(itp.data+"->");
		}
	}

	public int getMaxValue() {
		int max=head.data;
		Node it=head.next;
		while(it!=null)
		{
			if(it.data>max)
			{
				max=it.data;
			}
			it=it.next;
		}
		
		
		return max;
	}

	public int getMinValue() {
		
		int min=head.data;
		Node it=head.next;
		while(it!=null)
		{
			if(it.data<min)
			{
				min=it.data;
			}
			it=it.next;
		}
		
		return min;
	}

	public void append(LinkedList l1) {
		
		Node it=l1.head;
		while(it!=null)
		{
			this.append(it.getData());
			it=it.next;
		}
	}
	
	
	
}
