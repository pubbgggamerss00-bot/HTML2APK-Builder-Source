package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fb.s;
import fb.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import qa.a;

/* loaded from: classes2.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public final List<s> f6249a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f6250b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6251c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReceiver f6252d;

    public GetCredentialRequest(ArrayList credentialOptions, Bundle data, String str, ResultReceiver resultReceiver) {
        r.e(credentialOptions, "credentialOptions");
        r.e(data, "data");
        r.e(resultReceiver, "resultReceiver");
        this.f6249a = credentialOptions;
        this.f6250b = data;
        this.f6251c = str;
        this.f6252d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        r.e(dest, "dest");
        int iQ = c1.q(20293, dest);
        c1.p(dest, 1, this.f6249a, false);
        c1.e(dest, 2, this.f6250b, false);
        c1.m(dest, 3, this.f6251c, false);
        c1.l(dest, 4, this.f6252d, i10, false);
        c1.r(iQ, dest);
    }
}
