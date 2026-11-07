package org.jf.dexlib2.analysis;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import lc.t;
import lc.u;
import mc.a;
import mc.b;
import mc.c;
import mc.d;
import nc.k0;
import nc.v;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.analysis.reflection.ReflectionClassDef;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.immutable.ImmutableDexFile;
import qc.p;

/* loaded from: classes3.dex */
public class ClassPath {
    public static final int NOT_ART = -1;
    public static final int NOT_SPECIFIED = -2;
    private final boolean checkPackagePrivateAccess;
    private final b<String, TypeProto> classLoader;
    private List<ClassProvider> classProviders;
    private final t<OdexedFieldInstructionMapper> fieldInstructionMapperSupplier;
    private c<String, TypeProto> loadedClasses;
    public final int oatVersion;
    private final TypeProto unknownClass;

    public ClassPath(ClassProvider... classProviderArr) throws IOException {
        this(Arrays.asList(classProviderArr), false, -1);
    }

    private static ClassProvider getBasicClasses() {
        Opcodes opcodes = Opcodes.getDefault();
        ReflectionClassDef reflectionClassDef = new ReflectionClassDef(Class.class);
        ReflectionClassDef reflectionClassDef2 = new ReflectionClassDef(Cloneable.class);
        ReflectionClassDef reflectionClassDef3 = new ReflectionClassDef(Object.class);
        ReflectionClassDef reflectionClassDef4 = new ReflectionClassDef(Serializable.class);
        ReflectionClassDef reflectionClassDef5 = new ReflectionClassDef(String.class);
        ReflectionClassDef reflectionClassDef6 = new ReflectionClassDef(Throwable.class);
        int i10 = v.f18759c;
        Object[] objArr = {reflectionClassDef, reflectionClassDef2, reflectionClassDef3, reflectionClassDef4, reflectionClassDef5, reflectionClassDef6};
        System.arraycopy(new ReflectionClassDef[0], 0, objArr, 6, 0);
        return new DexClassProvider(new ImmutableDexFile(opcodes, (Collection<? extends ClassDef>) v.j(6, objArr)));
    }

    private void loadPrimitiveType(String str) {
        Object obj = this.loadedClasses;
        ((d.n) obj).f18113a.put(str, new PrimitiveProto(this, str));
    }

    public TypeProto getClass(CharSequence charSequence) {
        c<String, TypeProto> cVar = this.loadedClasses;
        String string = charSequence.toString();
        d.m mVar = (d.m) cVar;
        mVar.getClass();
        try {
            return (TypeProto) mVar.a(string);
        } catch (ExecutionException e10) {
            throw new p(e10.getCause());
        }
    }

    public ClassDef getClassDef(String str) {
        Iterator<ClassProvider> it = this.classProviders.iterator();
        while (it.hasNext()) {
            ClassDef classDef = it.next().getClassDef(str);
            if (classDef != null) {
                return classDef;
            }
        }
        throw new UnresolvedClassException("Could not resolve class %s", str);
    }

    public OdexedFieldInstructionMapper getFieldInstructionMapper() {
        return this.fieldInstructionMapperSupplier.get();
    }

    public TypeProto getUnknownClass() {
        return this.unknownClass;
    }

    public boolean isArt() {
        return this.oatVersion != -1;
    }

    public boolean shouldCheckPackagePrivateAccess() {
        return this.checkPackagePrivateAccess;
    }

    public ClassPath(Iterable<ClassProvider> iterable) throws IOException {
        this(iterable, false, -1);
    }

    public ClassPath(Iterable<? extends ClassProvider> iterable, boolean z10, int i10) {
        b<String, TypeProto> bVar = new b<String, TypeProto>() { // from class: org.jf.dexlib2.analysis.ClassPath.1
            @Override // mc.b
            public TypeProto load(String str) throws Exception {
                return str.charAt(0) == '[' ? new ArrayProto(ClassPath.this, str) : new ClassProto(ClassPath.this, str);
            }
        };
        this.classLoader = bVar;
        this.loadedClasses = new d.m(new d(new a(), bVar));
        this.fieldInstructionMapperSupplier = u.a(new t<OdexedFieldInstructionMapper>() { // from class: org.jf.dexlib2.analysis.ClassPath.2
            @Override // lc.t
            public OdexedFieldInstructionMapper get() {
                return new OdexedFieldInstructionMapper(ClassPath.this.isArt());
            }
        });
        UnknownClassProto unknownClassProto = new UnknownClassProto(this);
        this.unknownClass = unknownClassProto;
        Object obj = this.loadedClasses;
        ((d.n) obj).f18113a.put(unknownClassProto.getType(), unknownClassProto);
        this.checkPackagePrivateAccess = z10;
        this.oatVersion = i10;
        loadPrimitiveType("Z");
        loadPrimitiveType("B");
        loadPrimitiveType(kf.a.f16303b);
        loadPrimitiveType("C");
        loadPrimitiveType("I");
        loadPrimitiveType("J");
        loadPrimitiveType("F");
        loadPrimitiveType(kf.a.f16304c);
        loadPrimitiveType(i.f7029u);
        ArrayList arrayListA = k0.a(iterable);
        this.classProviders = arrayListA;
        arrayListA.add(getBasicClasses());
    }
}
