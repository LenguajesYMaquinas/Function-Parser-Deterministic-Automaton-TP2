// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/moore.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class moore {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      Object Q=$fix(GCollections.asSet("A","B","D","E"));
      $line=6;
      Object \u03A3=$fix(GCollections.asSet('a','b'));
      $line=7;
      Object \u0393=$fix(GCollections.asSet('0','1','2'));
      $line=8;
      Object q=$fix("A");
      $line=9;
      Object F=$fix(GCollections.asSet("A"));
      $line=11;
      Object A=$fix($invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(moore.class,"\u03B4"),new GMethod(moore.class,"g"),new GMethod(moore.class,"h")}));
      $line=12;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,A));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore.class,"main",$line);
    }
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=16;
      if ($opEqualY(q,"A")) {
        $line=17;
        if ($opEqualY(\u03C3,'a')) {
          $line=18;
          $result="D";
          if (true) break $try;
        }
        else {
          $line=20;
          $result="B";
          if (true) break $try;
        }
      }
      else {
        $line=22;
        if ($opEqualY(q,"B")) {
          $line=23;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=24;
          if ($opEqualY(q,"E")) {
            $line=25;
            $result="D";
            if (true) break $try;
          }
          else {
            $line=27;
            if ($opEqualY(\u03C3,'a')) {
              $line=28;
              $result="A";
              if (true) break $try;
            }
            else {
              $line=30;
              $result="E";
              if (true) break $try;
            }
          }
        }
      }
      $line=33;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=36;
      if ($opEqualY(q,"A")) {
        $line=37;
        $result='0';
        if (true) break $try;
      }
      else {
        $line=38;
        if ($opEqualY(q,"B")) {
          $line=39;
          $result='1';
          if (true) break $try;
        }
        else {
          $line=41;
          $result='2';
          if (true) break $try;
        }
      }
      $line=43;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=47;
      $result="";
      if (true) break $try;
      $line=48;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore.class,"h",$line);
    }
    return $result;
  }
}
