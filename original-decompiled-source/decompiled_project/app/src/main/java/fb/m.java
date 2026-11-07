package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class m extends qa.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final String f11151a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11152b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11153c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11154d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11155e;

    /* renamed from: f, reason: collision with root package name */
    public final ResultReceiver f11156f;

    public m(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(credentialData, "credentialData");
        kotlin.jvm.internal.r.e(candidateQueryData, "candidateQueryData");
        this.f11151a = type;
        this.f11152b = credentialData;
        this.f11153c = candidateQueryData;
        this.f11154d = str;
        this.f11155e = str2;
        this.f11156f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.m(dest, 1, this.f11151a, false);
        c1.e(dest, 2, this.f11152b, false);
        c1.e(dest, 3, this.f11153c, false);
        c1.m(dest, 4, this.f11154d, false);
        c1.m(dest, 5, this.f11155e, false);
        c1.l(dest, 6, this.f11156f, i10, false);
        c1.r(iQ, dest);
    }
}
