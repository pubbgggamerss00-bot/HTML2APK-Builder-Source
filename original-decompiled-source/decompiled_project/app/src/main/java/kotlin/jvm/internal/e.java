package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e implements kh.b, Serializable {
    public static final Object NO_RECEIVER = a.f16323a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient kh.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16323a = new a();
    }

    public e() {
        this(NO_RECEIVER);
    }

    @Override // kh.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kh.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public kh.b compute() {
        kh.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        kh.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract kh.b computeReflected();

    @Override // kh.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kh.b
    public String getName() {
        return this.name;
    }

    public kh.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return h0.a(cls);
        }
        h0.f16332a.getClass();
        return new x(cls);
    }

    @Override // kh.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public kh.b getReflected() {
        kh.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new dh.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kh.b
    public kh.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kh.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kh.b
    public kh.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kh.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kh.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kh.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kh.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public e(Object obj) {
        this(obj, null, null, null, false);
    }

    public e(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
