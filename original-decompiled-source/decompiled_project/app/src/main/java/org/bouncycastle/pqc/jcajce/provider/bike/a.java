package org.bouncycastle.pqc.jcajce.provider.bike;

import java.security.Key;
import k3.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d.c {
    public static String b(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    @Override // k3.d.c
    public Object a(d.a aVar) {
        aVar.b(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }
}
