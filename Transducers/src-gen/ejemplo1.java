// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/ejemplo1.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class ejemplo1 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=6;
      Object Q=$fix(GCollections.asSet("A","B"));
      $line=7;
      Object \u03A3=$fix(GCollections.asSet('0','1'));
      $line=8;
      Object q=$fix("A");
      $line=9;
      Object F=$fix(GCollections.asSet("B"));
      $line=10;
      Object \u03B4=$fix(new Object[]{new Object[]{"A",'0',"A"},new Object[]{"B",'0',"B"},new Object[]{"A",'1',"B"},new Object[]{"B",'1',"A"}});
      $line=16;
      GDeterministicAutomaton A=$cast(GDeterministicAutomaton.class,$fix($invokeConstructor(GDeterministicAutomaton.class,new Object[]{Q,\u03A3,q,F,\u03B4})));
      $line=17;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,A));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ejemplo1.class,"main",$line);
    }
  }
}