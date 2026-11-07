package r0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import r0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f implements Callable<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14233d;

    public f(String str, Context context, e eVar, int i6) {
        this.f14230a = str;
        this.f14231b = context;
        this.f14232c = eVar;
        this.f14233d = i6;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        Object[] objArr = {this.f14232c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return j.b(this.f14230a, this.f14231b, Collections.unmodifiableList(arrayList), this.f14233d);
    }
}
