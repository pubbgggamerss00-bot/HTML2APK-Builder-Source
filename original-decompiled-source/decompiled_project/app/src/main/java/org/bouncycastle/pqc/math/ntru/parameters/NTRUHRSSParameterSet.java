package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes3.dex */
public abstract class NTRUHRSSParameterSet extends NTRUParameterSet {
    public NTRUHRSSParameterSet(int i10, int i11, int i12, int i13, int i14) {
        super(i10, i11, i12, i13, i14);
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public Polynomial createPolynomial() {
        return n() == 1373 ? new HRSS1373Polynomial(this) : new HRSSPolynomial(this);
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public int sampleFgBytes() {
        return sampleIidBytes() * 2;
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public int sampleRmBytes() {
        return sampleIidBytes() * 2;
    }
}
