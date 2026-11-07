package com.google.android.gms.common.api;

import com.google.android.gms.common.api.l;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class i<R extends l> {

    public interface a {
        void a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await();

    @ResultIgnorabilityUnspecified
    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(m<? super R> mVar);

    public abstract void setResultCallback(m<? super R> mVar, long j10, TimeUnit timeUnit);

    public <S extends l> o<S> then(n<? super R, ? extends S> nVar) {
        throw new UnsupportedOperationException();
    }
}
