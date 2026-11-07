package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public interface Rewriters {
    Rewriter<AnnotationElement> getAnnotationElementRewriter();

    Rewriter<Annotation> getAnnotationRewriter();

    Rewriter<ClassDef> getClassDefRewriter();

    Rewriter<DebugItem> getDebugItemRewriter();

    Rewriter<DexFile> getDexFileRewriter();

    Rewriter<EncodedValue> getEncodedValueRewriter();

    Rewriter<ExceptionHandler> getExceptionHandlerRewriter();

    Rewriter<FieldReference> getFieldReferenceRewriter();

    Rewriter<Field> getFieldRewriter();

    Rewriter<Instruction> getInstructionRewriter();

    Rewriter<MethodImplementation> getMethodImplementationRewriter();

    Rewriter<MethodParameter> getMethodParameterRewriter();

    Rewriter<MethodReference> getMethodReferenceRewriter();

    Rewriter<Method> getMethodRewriter();

    Rewriter<TryBlock<? extends ExceptionHandler>> getTryBlockRewriter();

    Rewriter<String> getTypeRewriter();
}
