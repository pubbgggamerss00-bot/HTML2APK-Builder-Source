package m0;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import i0.y4;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t2.b;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {647}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f17592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(x2 x2Var, tg.e<? super y2> eVar) {
        super(2, eVar);
        this.f17592b = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y2(this.f17592b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        x2 x2Var;
        t2.b bVar;
        CharSequence text;
        int i10;
        int i11;
        long j10;
        ug.a aVar = ug.a.f29706a;
        int i12 = this.f17591a;
        byte b10 = 1;
        x2 x2Var2 = this.f17592b;
        if (i12 == 0) {
            pg.q.b(obj);
            j2.f2 f2Var = x2Var2.f17554h;
            if (f2Var != null) {
                this.f17591a = 1;
                objB = f2Var.b();
                if (objB == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        objB = obj;
        j2.e2 e2Var = (j2.e2) objB;
        if (e2Var != null) {
            ClipData clipData = e2Var.f14713a;
            int i13 = 0;
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                x2Var = x2Var2;
                bVar = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                kotlin.jvm.internal.r.e(annotationArr, "<this>");
                int length = annotationArr.length - 1;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i14];
                        if (kotlin.jvm.internal.r.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            Parcel parcelObtain = Parcel.obtain();
                            byte[] bArrDecode = Base64.decode(value, i13);
                            parcelObtain.unmarshall(bArrDecode, i13, bArrDecode.length);
                            parcelObtain.setDataPosition(i13);
                            long j11 = q1.b1.f21654h;
                            long j12 = j11;
                            long jE = f3.t.f8833c;
                            long jE2 = jE;
                            x2.p pVar = null;
                            x2.n nVar = null;
                            x2.o oVar = null;
                            String string = null;
                            e3.a aVar2 = null;
                            e3.m mVar = null;
                            e3.i iVar = null;
                            q1.e2 e2Var2 = null;
                            while (parcelObtain.dataAvail() > b10) {
                                byte b11 = parcelObtain.readByte();
                                if (b11 != b10) {
                                    i11 = spanStart;
                                    i10 = i13;
                                    int i15 = 2;
                                    if (b11 != 2) {
                                        x2Var = x2Var2;
                                        if (b11 == 3) {
                                            if (parcelObtain.dataAvail() < 4) {
                                                break;
                                            }
                                            pVar = new x2.p(parcelObtain.readInt());
                                            spanStart = i11;
                                            i13 = i10;
                                            x2Var2 = x2Var;
                                            b10 = 1;
                                        } else if (b11 == 4) {
                                            if (parcelObtain.dataAvail() < 1) {
                                                break;
                                            }
                                            byte b12 = parcelObtain.readByte();
                                            nVar = new x2.n((b12 != 0 && b12 == 1) ? 1 : i10);
                                            b10 = 1;
                                            spanStart = i11;
                                            i13 = i10;
                                            x2Var2 = x2Var;
                                        } else if (b11 != 5) {
                                            if (b11 == 6) {
                                                string = parcelObtain.readString();
                                            } else if (b11 == 7) {
                                                if (parcelObtain.dataAvail() < 5) {
                                                    break;
                                                }
                                                byte b13 = parcelObtain.readByte();
                                                long j13 = b13 == 1 ? 4294967296L : b13 == 2 ? 8589934592L : 0L;
                                                jE2 = f3.v.a(j13, 0L) ? f3.t.f8833c : f3.u.e(parcelObtain.readFloat(), j13);
                                            } else if (b11 == 8) {
                                                if (parcelObtain.dataAvail() < 4) {
                                                    break;
                                                }
                                                aVar2 = new e3.a(parcelObtain.readFloat());
                                            } else if (b11 == 9) {
                                                if (parcelObtain.dataAvail() < 8) {
                                                    break;
                                                }
                                                mVar = new e3.m(parcelObtain.readFloat(), parcelObtain.readFloat());
                                            } else if (b11 == 10) {
                                                if (parcelObtain.dataAvail() < 8) {
                                                    break;
                                                }
                                                j12 = parcelObtain.readLong();
                                                int i16 = q1.b1.f21655i;
                                            } else if (b11 != 11) {
                                                if (b11 == 12) {
                                                    if (parcelObtain.dataAvail() < 20) {
                                                        break;
                                                    }
                                                    long j14 = parcelObtain.readLong();
                                                    int i17 = q1.b1.f21655i;
                                                    spanStart = i11;
                                                    i13 = i10;
                                                    x2Var2 = x2Var;
                                                    e2Var2 = new q1.e2(j14, (Float.floatToRawIntBits(parcelObtain.readFloat()) << 32) | (Float.floatToRawIntBits(parcelObtain.readFloat()) & BodyPartID.bodyIdMax), parcelObtain.readFloat());
                                                }
                                                b10 = 1;
                                            } else {
                                                if (parcelObtain.dataAvail() < 4) {
                                                    break;
                                                }
                                                int i18 = parcelObtain.readInt();
                                                int i19 = (i18 & 2) != 0 ? 1 : i10;
                                                int i20 = (i18 & 1) != 0 ? 1 : i10;
                                                e3.i iVar2 = e3.i.f8366d;
                                                e3.i iVar3 = e3.i.f8365c;
                                                if (i19 != 0 && i20 != 0) {
                                                    List listJ = qg.p.j(iVar2, iVar3);
                                                    Integer numValueOf = Integer.valueOf(i10);
                                                    int size = listJ.size();
                                                    for (int i21 = i10; i21 < size; i21++) {
                                                        numValueOf = Integer.valueOf(numValueOf.intValue() | ((e3.i) listJ.get(i21)).f8367a);
                                                    }
                                                    iVar2 = new e3.i(numValueOf.intValue());
                                                } else if (i19 == 0) {
                                                    iVar = i20 != 0 ? iVar3 : e3.i.f8364b;
                                                }
                                                iVar = iVar2;
                                            }
                                            spanStart = i11;
                                            i13 = i10;
                                            x2Var2 = x2Var;
                                            b10 = 1;
                                        } else {
                                            if (parcelObtain.dataAvail() < 1) {
                                                break;
                                            }
                                            byte b14 = parcelObtain.readByte();
                                            if (b14 != 0) {
                                                if (b14 == 1) {
                                                    i15 = 65535;
                                                } else if (b14 != 3) {
                                                    i15 = b14 == 2 ? 1 : i10;
                                                }
                                                oVar = new x2.o(i15);
                                                spanStart = i11;
                                                i13 = i10;
                                                x2Var2 = x2Var;
                                                b10 = 1;
                                            }
                                        }
                                    } else {
                                        if (parcelObtain.dataAvail() < 5) {
                                            x2Var = x2Var2;
                                            break;
                                        }
                                        byte b15 = parcelObtain.readByte();
                                        if (b15 == b10) {
                                            x2Var = x2Var2;
                                            j10 = 4294967296L;
                                        } else if (b15 == 2) {
                                            x2Var = x2Var2;
                                            j10 = 8589934592L;
                                        } else {
                                            x2Var = x2Var2;
                                            j10 = 0;
                                        }
                                        jE = f3.v.a(j10, 0L) ? f3.t.f8833c : f3.u.e(parcelObtain.readFloat(), j10);
                                        spanStart = i11;
                                        i13 = i10;
                                        x2Var2 = x2Var;
                                        b10 = 1;
                                    }
                                } else {
                                    if (parcelObtain.dataAvail() < 8) {
                                        break;
                                    }
                                    j11 = parcelObtain.readLong();
                                    int i22 = q1.b1.f21655i;
                                }
                            }
                            i10 = i13;
                            x2Var = x2Var2;
                            i11 = spanStart;
                            arrayList.add(new b.c(new t2.b0(j11, jE, pVar, nVar, oVar, (x2.f) null, string, jE2, aVar2, mVar, (a3.c) null, j12, iVar, e2Var2, 49152), i11, spanEnd));
                        } else {
                            i10 = i13;
                            x2Var = x2Var2;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        i13 = i10;
                        x2Var2 = x2Var;
                        b10 = 1;
                    }
                } else {
                    x2Var = x2Var2;
                }
                bVar = new t2.b(4, text.toString(), arrayList);
            } else {
                bVar = new t2.b(text.toString());
                x2Var = x2Var2;
            }
            if (bVar != null) {
                b.C0288b c0288b = new b.C0288b(y2.d0.c(x2Var.k(), x2Var.k().f33682a.f27761b.length()));
                c0288b.c(bVar);
                t2.b bVarE = c0288b.e();
                t2.b bVarB = y2.d0.b(x2Var.k(), x2Var.k().f33682a.f27761b.length());
                b.C0288b c0288b2 = new b.C0288b(bVarE);
                c0288b2.c(bVarB);
                t2.b bVarE2 = c0288b2.e();
                int length2 = bVar.f27761b.length() + t2.j0.e(x2Var.k().f33683b);
                x2 x2Var3 = x2Var;
                x2Var3.f17549c.invoke(x2.c(bVarE2, t2.k0.a(length2, length2)));
                x2Var3.o(i0.v1.f13646a);
                y4 y4Var = x2Var3.f17547a;
                if (y4Var != null) {
                    y4Var.f13712f = true;
                }
                return pg.f0.f21461a;
            }
        }
        return pg.f0.f21461a;
    }
}
