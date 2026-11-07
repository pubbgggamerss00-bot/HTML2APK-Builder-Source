package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b implements v5.b, Serializable {
    public static final Object NO_RECEIVER = a.s;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient v5.b reflected;
    private final String signature;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements Serializable {
        public static final a s = new a();
    }

    public b() {
        this(NO_RECEIVER);
    }

    @Override // v5.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // v5.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public v5.b compute() {
        v5.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        v5.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract v5.b computeReflected();

    @Override // v5.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public v5.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            q.f13553a.getClass();
            return new l(cls);
        }
        q.f13553a.getClass();
        return new d(cls);
    }

    @Override // v5.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public v5.b getReflected() {
        v5.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new o5.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // v5.b
    public v5.g getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // v5.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // v5.b
    public v5.h getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // v5.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // v5.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // v5.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // v5.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public b(Object obj) {
        this(obj, null, null, null, false);
    }

    public b(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }
}
