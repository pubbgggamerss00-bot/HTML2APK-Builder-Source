package org.jf.dexlib2.analysis;

import j2.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc.v;
import m3.a;
import oc.c;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.instruction.InlineIndexInstruction;
import org.jf.dexlib2.immutable.ImmutableMethod;
import org.jf.dexlib2.immutable.ImmutableMethodParameter;
import org.jf.dexlib2.immutable.reference.ImmutableMethodReference;
import org.jf.dexlib2.immutable.util.ParamUtil;

/* loaded from: classes3.dex */
public class CustomInlineMethodResolver extends InlineMethodResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Pattern longMethodPattern = Pattern.compile("(L[^;]+;)->([^(]+)\\(([^)]*)\\)(.+)");
    private final ClassPath classPath;
    private final Method[] inlineMethods;

    public CustomInlineMethodResolver(ClassPath classPath, String str) throws IOException {
        this.classPath = classPath;
        StringReader stringReader = new StringReader(str);
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                if (line.length() > 0) {
                    arrayList.add(line);
                }
            }
            this.inlineMethods = new Method[arrayList.size()];
            int i10 = 0;
            while (true) {
                Method[] methodArr = this.inlineMethods;
                if (i10 >= methodArr.length) {
                    return;
                }
                methodArr[i10] = parseAndResolveInlineMethod((String) arrayList.get(i10));
                i10++;
            }
        } catch (IOException e10) {
            throw new RuntimeException("Error while parsing inline table", e10);
        }
    }

    private Method parseAndResolveInlineMethod(String str) {
        int accessFlags;
        Matcher matcher = longMethodPattern.matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException(a.a("Invalid method descriptor: ", str));
        }
        boolean z10 = true;
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        Iterable<ImmutableMethodParameter> paramString = ParamUtil.parseParamString(matcher.group(3));
        String strGroup3 = matcher.group(4);
        ImmutableMethodReference immutableMethodReference = new ImmutableMethodReference(strGroup, strGroup2, paramString, strGroup3);
        TypeProto typeProto = this.classPath.getClass(strGroup);
        if (typeProto instanceof ClassProto) {
            for (Method method : ((ClassProto) typeProto).getClassDef().getMethods()) {
                if (method.equals(immutableMethodReference)) {
                    accessFlags = method.getAccessFlags();
                    break;
                }
            }
            z10 = false;
            accessFlags = 0;
        } else {
            z10 = false;
            accessFlags = 0;
        }
        if (z10) {
            return new ImmutableMethod(strGroup, strGroup2, paramString, strGroup3, accessFlags, (Set<? extends Annotation>) null, (Set<HiddenApiRestriction>) null, (MethodImplementation) null);
        }
        throw new RuntimeException(a.a("Cannot resolve inline method: ", str));
    }

    @Override // org.jf.dexlib2.analysis.InlineMethodResolver
    public Method resolveExecuteInline(AnalyzedInstruction analyzedInstruction) {
        int inlineIndex = ((InlineIndexInstruction) analyzedInstruction.instruction).getInlineIndex();
        if (inlineIndex >= 0) {
            Method[] methodArr = this.inlineMethods;
            if (inlineIndex < methodArr.length) {
                return methodArr[inlineIndex];
            }
        }
        throw new RuntimeException(y.a(inlineIndex, "Invalid method index: "));
    }

    public CustomInlineMethodResolver(ClassPath classPath, File file) throws Throwable {
        Charset charsetForName = Charset.forName("UTF-8");
        file.getClass();
        charsetForName.getClass();
        c cVar = new c(c.f19133d);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            cVar.f19135b.addFirst(fileInputStream);
            byte[] bArrB = oc.a.b(fileInputStream, fileInputStream.getChannel().size());
            cVar.close();
            this(classPath, new String(bArrB, charsetForName));
        } catch (Throwable th2) {
            try {
                cVar.f19136c = th2;
                Object obj = v.f16973a;
                if (!IOException.class.isInstance(th2)) {
                    if (!(th2 instanceof RuntimeException)) {
                        if (!(th2 instanceof Error)) {
                            throw new RuntimeException(th2);
                        }
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                }
                throw ((Throwable) IOException.class.cast(th2));
            } catch (Throwable th3) {
                cVar.close();
                throw th3;
            }
        }
    }
}
