����   4 @  "com/loiane/cursojava/aula14/IfElse  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this $Lcom/loiane/cursojava/aula14/IfElse; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Entre com o preço do item
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D@$       . Está barato, pode comprar@.       2 Você pode pedir um desconto@1       6 Pode pesquisar mais args [Ljava/lang/String; scan Ljava/util/Scanner; valor D StackMapTable 
SourceFile IfElse.java !               /     *� �    
                    	       �     _� Y� � L� � !+� 'I( +�� � -� !� 6( +�� ( /�� � 1� !� ( /�� ( 3�� � 5� !�    
   * 
   	          (  ;   C ! V " ^ &         _ 7 8    T 9 :   G ; <  =    � +   >    ?