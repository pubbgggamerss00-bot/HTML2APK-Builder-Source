package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements jm0, eq0 {
    public final /* synthetic */ int s = 2;

    /* renamed from: t, reason: collision with root package name */
    public int f3443t;

    /* renamed from: u, reason: collision with root package name */
    public long f3444u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3445v;

    public /* synthetic */ c7() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6zza(Object obj) {
        long j6;
        long j7;
        zn1 zn1Var;
        boolean z6;
        switch (this.s) {
            case 0:
                d7 d7Var = (d7) this.f3445v;
                long j8 = this.f3444u;
                int i6 = this.f3443t;
                v6 v6Var = (v6) obj;
                ex0 ex0Var = d7Var.f3775c;
                y5.k(d7Var.h);
                bo1 bo1Var = v6Var.f9719a;
                long j9 = v6Var.f9721c;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bo1Var.size());
                boolean z7 = false;
                zn1 zn1VarListIterator = bo1Var.listIterator(0);
                while (zn1VarListIterator.hasNext()) {
                    xg0 xg0Var = (xg0) zn1VarListIterator.next();
                    Bitmap bitmap = xg0Var.f10573d;
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = xg0Var.f10570a;
                    if (charSequence != null) {
                        bundle.putCharSequence(xg0.f10560p, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = di0.f3939a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            j7 = j8;
                            dj0[] dj0VarArr = (dj0[]) spanned.getSpans(0, spanned.length(), dj0.class);
                            int length = dj0VarArr.length;
                            int i7 = 0;
                            while (i7 < length) {
                                dj0[] dj0VarArr2 = dj0VarArr;
                                dj0 dj0Var = dj0VarArr2[i7];
                                dj0Var.getClass();
                                int i8 = length;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(dj0.f3951c, dj0Var.f3953a);
                                bundle2.putInt(dj0.f3952d, dj0Var.f3954b);
                                arrayList2.add(di0.a(spanned, dj0Var, 1, bundle2));
                                i7++;
                                dj0VarArr = dj0VarArr2;
                                length = i8;
                                zn1VarListIterator = zn1VarListIterator;
                            }
                            zn1Var = zn1VarListIterator;
                            tj0[] tj0VarArr = (tj0[]) spanned.getSpans(0, spanned.length(), tj0.class);
                            int i9 = 0;
                            for (int length2 = tj0VarArr.length; i9 < length2; length2 = length2) {
                                tj0 tj0Var = tj0VarArr[i9];
                                tj0Var.getClass();
                                tj0[] tj0VarArr2 = tj0VarArr;
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(tj0.f9305d, tj0Var.f9308a);
                                bundle3.putInt(tj0.f9306e, tj0Var.f9309b);
                                bundle3.putInt(tj0.f9307f, tj0Var.f9310c);
                                arrayList2.add(di0.a(spanned, tj0Var, 2, bundle3));
                                i9++;
                                tj0VarArr = tj0VarArr2;
                            }
                            ui0[] ui0VarArr = (ui0[]) spanned.getSpans(0, spanned.length(), ui0.class);
                            int i10 = 0;
                            for (int length3 = ui0VarArr.length; i10 < length3; length3 = length3) {
                                arrayList2.add(di0.a(spanned, ui0VarArr[i10], 3, null));
                                i10++;
                                ui0VarArr = ui0VarArr;
                            }
                            hk0[] hk0VarArr = (hk0[]) spanned.getSpans(0, spanned.length(), hk0.class);
                            int i11 = 0;
                            for (int length4 = hk0VarArr.length; i11 < length4; length4 = length4) {
                                hk0 hk0Var = hk0VarArr[i11];
                                hk0Var.getClass();
                                hk0[] hk0VarArr2 = hk0VarArr;
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(hk0.f5434b, hk0Var.f5435a);
                                arrayList2.add(di0.a(spanned, hk0Var, 4, bundle4));
                                i11++;
                                hk0VarArr = hk0VarArr2;
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(xg0.f10561q, arrayList2);
                            }
                        } else {
                            j7 = j8;
                            zn1Var = zn1VarListIterator;
                        }
                    }
                    bundle.putSerializable(xg0.f10562r, xg0Var.f10571b);
                    bundle.putSerializable(xg0.s, xg0Var.f10572c);
                    bundle.putFloat(xg0.f10564u, xg0Var.f10574e);
                    bundle.putInt(xg0.f10565v, xg0Var.f10575f);
                    bundle.putInt(xg0.f10566w, xg0Var.f10576g);
                    bundle.putFloat(xg0.f10567x, xg0Var.h);
                    bundle.putInt(xg0.f10568y, xg0Var.f10577i);
                    bundle.putInt(xg0.f10569z, xg0Var.f10580l);
                    bundle.putFloat(xg0.A, xg0Var.f10581m);
                    bundle.putFloat(xg0.B, xg0Var.f10578j);
                    bundle.putFloat(xg0.C, xg0Var.f10579k);
                    bundle.putBoolean(xg0.E, false);
                    bundle.putInt(xg0.D, -16777216);
                    bundle.putInt(xg0.F, xg0Var.f10582n);
                    bundle.putFloat(xg0.G, xg0Var.f10583o);
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        z6 = false;
                        y5.r(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(xg0.f10563t, byteArrayOutputStream.toByteArray());
                    } else {
                        z6 = false;
                    }
                    arrayList.add(bundle);
                    z7 = z6;
                    j8 = j7;
                    zn1VarListIterator = zn1Var;
                }
                long j10 = j8;
                boolean z8 = z7;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", j9);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle5);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                int length5 = bArrMarshall.length;
                ex0Var.h(length5, bArrMarshall);
                d7Var.f3773a.e(length5, ex0Var);
                long j11 = v6Var.f9720b;
                if (j11 == -9223372036854775807L) {
                    y5.r(d7Var.h.f9983r == Long.MAX_VALUE ? true : z8);
                    j6 = j10;
                } else {
                    long j12 = d7Var.h.f9983r;
                    j6 = j12 == Long.MAX_VALUE ? j10 + j11 : j12 + j11;
                }
                d7Var.f3773a.a(j6, i6, length5, 0, null);
                break;
            default:
                ((yc2) obj).c((xc2) this.f3445v, this.f3443t, this.f3444u);
                break;
        }
    }

    public /* synthetic */ c7(d7 d7Var, long j6, int i6) {
        this.f3445v = d7Var;
        this.f3444u = j6;
        this.f3443t = i6;
    }

    public /* synthetic */ c7(xc2 xc2Var, int i6, long j6, long j7) {
        this.f3445v = xc2Var;
        this.f3443t = i6;
        this.f3444u = j6;
    }
}
