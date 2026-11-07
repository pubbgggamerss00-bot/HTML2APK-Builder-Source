package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public class HybridValueParameterSpec implements AlgorithmParameterSpec, Destroyable {
    private volatile AlgorithmParameterSpec baseSpec;
    private final boolean doPrepend;
    private final AtomicBoolean hasBeenDestroyed;

    /* renamed from: t, reason: collision with root package name */
    private volatile byte[] f20139t;

    public HybridValueParameterSpec(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        this(bArr, false, algorithmParameterSpec);
    }

    private void checkDestroyed() {
        if (isDestroyed()) {
            throw new IllegalStateException("spec has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        Arrays.clear(this.f20139t);
        this.f20139t = null;
        this.baseSpec = null;
    }

    public AlgorithmParameterSpec getBaseParameterSpec() {
        AlgorithmParameterSpec algorithmParameterSpec = this.baseSpec;
        checkDestroyed();
        return algorithmParameterSpec;
    }

    public byte[] getT() {
        byte[] bArr = this.f20139t;
        checkDestroyed();
        return bArr;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public boolean isPrependedT() {
        return this.doPrepend;
    }

    public HybridValueParameterSpec(byte[] bArr, boolean z10, AlgorithmParameterSpec algorithmParameterSpec) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.f20139t = bArr;
        this.baseSpec = algorithmParameterSpec;
        this.doPrepend = z10;
    }
}
