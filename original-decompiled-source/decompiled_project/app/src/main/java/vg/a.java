package vg;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import pg.f0;
import pg.q;
import vg.f;

/* loaded from: classes2.dex */
public abstract class a implements tg.e<Object>, d, Serializable {
    private final tg.e<Object> completion;

    public a(tg.e<Object> eVar) {
        this.completion = eVar;
    }

    public tg.e<f0> create(tg.e<?> completion) {
        r.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        tg.e<Object> eVar = this.completion;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    public final tg.e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.a aVar = f.f30978b;
        f.a aVar2 = f.f30977a;
        if (aVar == null) {
            try {
                f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f30978b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                f.f30978b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.f30979a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = aVar.f30980b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVar.f30981c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tg.e
    public final void resumeWith(Object obj) {
        tg.e eVar = this;
        while (true) {
            a aVar = (a) eVar;
            tg.e eVar2 = aVar.completion;
            r.b(eVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == ug.a.f29706a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = q.a(th2);
            }
            aVar.releaseIntercepted();
            if (!(eVar2 instanceof a)) {
                eVar2.resumeWith(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public tg.e<f0> create(Object obj, tg.e<?> completion) {
        r.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
