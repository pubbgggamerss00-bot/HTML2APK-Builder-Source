package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new b2();

    /* renamed from: a, reason: collision with root package name */
    public final Enum f7746a;

    public static class a extends Exception {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(db.a aVar) {
        this.f7746a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i10) throws a {
        b0 b0Var;
        if (i10 == -262) {
            b0Var = b0.RS1;
        } else {
            b0[] b0VarArrValues = b0.values();
            int length = b0VarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.f7748a == i10) {
                            b0Var = pVar;
                        }
                    }
                    throw new a(ad.b.b(i10, "Algorithm with COSE value ", " not supported"));
                }
                b0 b0Var2 = b0VarArrValues[i11];
                if (b0Var2.f7679a == i10) {
                    b0Var = b0Var2;
                    break;
                }
                i11++;
            }
        }
        return new o(b0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [db.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [db.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.f7746a.a() == ((o) obj).f7746a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7746a});
    }

    public final String toString() {
        return i8.n.d("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f7746a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [db.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7746a.a());
    }
}
