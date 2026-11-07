package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* loaded from: classes.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* renamed from: j, reason: collision with root package name */
    private final BigInteger f20136j;

    /* renamed from: m, reason: collision with root package name */
    private final int f20137m;

    /* renamed from: q, reason: collision with root package name */
    private final BigInteger f20138q;
    private DHValidationParameters validationParameters;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f20138q, this.f20137m, getL(), this.f20136j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.f20136j;
    }

    public int getM() {
        return this.f20137m;
    }

    public BigInteger getQ() {
        return this.f20138q;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, null, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, int i11) {
        super(bigInteger, bigInteger3, i11);
        this.f20138q = bigInteger2;
        this.f20136j = bigInteger4;
        this.f20137m = i10;
    }

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.validationParameters = dHParameters.getValidationParameters();
    }
}
