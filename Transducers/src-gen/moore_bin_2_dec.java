// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/moore_bin_2_dec.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class moore_bin_2_dec {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=18;
      Object M=$fix(moore_bin_2_dec.createTransducer());
      $line=19;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,M));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore_bin_2_dec.class,"main",$line);
    }
  }
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=23;
      Object Q=$fix(GCollections.asSet("Init0","Init1","Init2","Init3",0,1));
      $line=24;
      Object \u03A3=$fix(GCollections.asSet('0','1'));
      $line=25;
      Object \u0393=$fix($opIntvlY('0','3'));
      $line=26;
      Object q0=$fix("Init0");
      $line=27;
      Object F=$fix(GCollections.asSet("Init0","Init1","Init2","Init3"));
      $line=28;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q0,F,new GMethod(moore_bin_2_dec.class,"\u03B4"),new GMethod(moore_bin_2_dec.class,"g"),new GMethod(moore_bin_2_dec.class,"h")});
      if (true) break $try;
      $line=29;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore_bin_2_dec.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=32;
      if ($opEqualY(q,0)) {
        $line=33;
        $result=$opAdditY("Init",\u03C3);
        if (true) break $try;
      }
      else {
        $line=34;
        if (($opEqualY(q,1)&&$opEqualY(\u03C3,'0'))) {
          $line=35;
          $result="Init2";
          if (true) break $try;
        }
        else {
          $line=36;
          if (($opEqualY(q,1)&&$opEqualY(\u03C3,'1'))) {
            $line=37;
            $result="Init3";
            if (true) break $try;
          }
          else {
            $line=38;
            if ($opEqualY(\u03C3,'0')) {
              $line=39;
              $result=0;
              if (true) break $try;
            }
            else {
              $line=41;
              $result=1;
              if (true) break $try;
            }
          }
        }
      }
      $line=43;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore_bin_2_dec.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=46;
      $result="";
      if (true) break $try;
      $line=47;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore_bin_2_dec.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=50;
      if ($opEqualY(q,"Init0")) {
        $line=51;
        $result=0;
        if (true) break $try;
      }
      else {
        $line=52;
        if ($opEqualY(q,"Init1")) {
          $line=53;
          $result=1;
          if (true) break $try;
        }
        else {
          $line=54;
          if ($opEqualY(q,"Init2")) {
            $line=55;
            $result=2;
            if (true) break $try;
          }
          else {
            $line=56;
            if ($opEqualY(q,"Init3")) {
              $line=57;
              $result=3;
              if (true) break $try;
            }
            else {
              $line=59;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=61;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,moore_bin_2_dec.class,"g",$line);
    }
    return $result;
  }
}
