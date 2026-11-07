package v3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import v3.j;

/* loaded from: classes.dex */
public final class f implements Callable<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f30577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30578d;

    public f(String str, Context context, e eVar, int i10) {
        this.f30575a = str;
        this.f30576b = context;
        this.f30577c = eVar;
        this.f30578d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() throws Exception {
        Object[] objArr = {this.f30577c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return j.b(this.f30575a, this.f30576b, Collections.unmodifiableList(arrayList), this.f30578d);
    }
}
