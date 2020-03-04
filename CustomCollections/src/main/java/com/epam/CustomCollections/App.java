package com.epam.CustomCollections;
import java.util.*;
import java.io.*;
public class App
{
   private Object[] objarray=new Object[10];
   private int i=0;
   public void increasecapacity()
   {
  int newcapacity=objarray.length*2;
  Object[] newarray=new Object[newcapacity];
  for(int j=0;j<objarray.length;j++)
  newarray[j]=objarray[j];
  objarray=newarray;
   }
   public void addelements(Object ob)
   {
  if(i==objarray.length)
  increasecapacity();
  objarray[i]=ob;
  i++;
   }
   public int capacity()
   {
  return objarray.length;
   }
   public int size()
   {
  return i;
   }
   public Object get(int index)
   {
  if(index<0 || index>=size())
  {
  System.out.println("IndexOutOfBoundException");
  return index;
  }
  else
  return (objarray[index]);
   }
   public void remove(int index)
   {
  if(index<0 || index>=size())
System.out.println("Index out of bound exception");
  else
  {
  while(index<size()-1)
  {
  objarray[index]=objarray[index+1];
  index++;
  }
  objarray[index]=null;
  i--;
  }
   }
   private int k=0;
   public void print()
   {
// TODO Auto-generated method stub
for(int j=k;j<i;j++)
  System.out.print(objarray[j]+" ");
   }
}