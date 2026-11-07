package fa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.auth.zzbz;
import j2.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ua.a;

/* loaded from: classes2.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final p.a f11120g;

    /* renamed from: a, reason: collision with root package name */
    public final int f11121a;

    /* renamed from: b, reason: collision with root package name */
    public List f11122b;

    /* renamed from: c, reason: collision with root package name */
    public List f11123c;

    /* renamed from: d, reason: collision with root package name */
    public List f11124d;

    /* renamed from: e, reason: collision with root package name */
    public List f11125e;

    /* renamed from: f, reason: collision with root package name */
    public List f11126f;

    static {
        p.a aVar = new p.a();
        f11120g = aVar;
        aVar.put("registered", a.C0303a.d(2, "registered"));
        aVar.put("in_progress", a.C0303a.d(3, "in_progress"));
        aVar.put("success", a.C0303a.d(4, "success"));
        aVar.put("failed", a.C0303a.d(5, "failed"));
        aVar.put("escrowed", a.C0303a.d(6, "escrowed"));
    }

    public e() {
        this.f11121a = 1;
    }

    @Override // ua.a
    public final Map getFieldMappings() {
        return f11120g;
    }

    @Override // ua.a
    public final Object getFieldValue(a.C0303a c0303a) {
        switch (c0303a.f29669g) {
            case 1:
                return Integer.valueOf(this.f11121a);
            case 2:
                return this.f11122b;
            case 3:
                return this.f11123c;
            case 4:
                return this.f11124d;
            case 5:
                return this.f11125e;
            case 6:
                return this.f11126f;
            default:
                throw new IllegalStateException(y.a(c0303a.f29669g, "Unknown SafeParcelable id="));
        }
    }

    @Override // ua.a
    public final boolean isFieldSet(a.C0303a c0303a) {
        return true;
    }

    @Override // ua.a
    public final void setStringsInternal(a.C0303a c0303a, String str, ArrayList arrayList) {
        int i10 = c0303a.f29669g;
        if (i10 == 2) {
            this.f11122b = arrayList;
            return;
        }
        if (i10 == 3) {
            this.f11123c = arrayList;
            return;
        }
        if (i10 == 4) {
            this.f11124d = arrayList;
        } else if (i10 == 5) {
            this.f11125e = arrayList;
        } else {
            if (i10 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i10)));
            }
            this.f11126f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f11121a);
        c1.n(parcel, 2, this.f11122b);
        c1.n(parcel, 3, this.f11123c);
        c1.n(parcel, 4, this.f11124d);
        c1.n(parcel, 5, this.f11125e);
        c1.n(parcel, 6, this.f11126f);
        c1.r(iQ, parcel);
    }

    public e(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f11121a = i10;
        this.f11122b = arrayList;
        this.f11123c = arrayList2;
        this.f11124d = arrayList3;
        this.f11125e = arrayList4;
        this.f11126f = arrayList5;
    }
}
