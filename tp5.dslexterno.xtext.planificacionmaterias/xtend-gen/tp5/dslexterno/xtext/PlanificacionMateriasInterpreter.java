package tp5.dslexterno.xtext;

import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import tp5.dslexterno.xtext.PlanificacionMateriasStandaloneSetup;
import tp5.dslexterno.xtext.planificacionMaterias.Model;

@SuppressWarnings("all")
public class PlanificacionMateriasInterpreter {
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      throw new RuntimeException("Debe invocar este interprete con la ruta completa a un archivo .pmdsl como argumento");
    }
    final String fileName = args[0];
    final Model model = PlanificacionMateriasInterpreter.parsear(fileName);
    PlanificacionMateriasInterpreter _planificacionMateriasInterpreter = new PlanificacionMateriasInterpreter();
    _planificacionMateriasInterpreter.interpret(model);
  }
  
  public static Model parsear(final String fileName) {
    try {
      PlanificacionMateriasStandaloneSetup _planificacionMateriasStandaloneSetup = new PlanificacionMateriasStandaloneSetup();
      final Injector injector = _planificacionMateriasStandaloneSetup.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      URI _createURI = URI.createURI(fileName);
      final Resource resource = resourceSet.createResource(_createURI);
      Map<Object, Object> _xsetliteral = null;
      Map<Object, Object> _tempMap = Maps.<Object, Object>newHashMap();
      _xsetliteral = Collections.<Object, Object>unmodifiableMap(_tempMap);
      resource.load(_xsetliteral);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      return ((Model) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object interpret(final Model model) {
    return null;
  }
}
