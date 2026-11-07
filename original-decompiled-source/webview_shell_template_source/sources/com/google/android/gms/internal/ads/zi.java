package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zi {

    /* renamed from: a, reason: collision with root package name */
    public final yi f11299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11301c;

    public zi(int i6, int i7, int i8) {
        this.f11300b = i6;
        i7 = (i7 > 64 || i7 < 0) ? 64 : i7;
        if (i8 <= 0) {
            this.f11301c = 1;
        } else {
            this.f11301c = i8;
        }
        this.f11299a = new yi(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r2.size() < r12) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(ArrayList arrayList, ArrayList arrayList2) throws IOException {
        boolean z6;
        boolean z7;
        Collections.sort(arrayList2, new h8(1));
        HashSet hashSet = new HashSet();
        loop0: for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((si) arrayList2.get(i6)).f8944e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                    String str = strArrSplit[i7];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i8 = 1;
                        boolean z8 = false;
                        while (true) {
                            int i9 = i8 + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i8) == '\'') {
                                if (sb.charAt(i8 - 1) != ' ') {
                                    int i10 = i8 + 1;
                                    z7 = true;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(i8, ' ');
                                        i8 = i9;
                                    }
                                    z8 = z7;
                                } else {
                                    z7 = true;
                                }
                                sb.setCharAt(i8, ' ');
                                z8 = z7;
                            }
                            i8++;
                        }
                        z6 = true;
                        String string = z8 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z6 = true;
                    }
                    String[] strArrB = ui.b(str, z6);
                    int length = strArrB.length;
                    int i11 = this.f11301c;
                    if (length >= i11) {
                        int i12 = 0;
                        while (true) {
                            int length2 = strArrB.length;
                            int i13 = this.f11300b;
                            if (i12 >= length2) {
                                break;
                            }
                            String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = i12 + i14;
                                if (i15 >= strArrB.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrB[i15]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i13) {
                                break loop0;
                            }
                            i12++;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(this.f11299a.A((String) it.next()));
            } catch (IOException e6) {
                zzo.zzh("Error while writing hash to byteStream", e6);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e7) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e8) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e8);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }
}
