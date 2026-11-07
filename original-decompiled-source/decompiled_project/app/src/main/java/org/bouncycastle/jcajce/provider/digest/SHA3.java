package org.bouncycastle.jcajce.provider.digest;

import b.o;
import c2.u;
import j2.y;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.ParallelHash;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.digests.TupleHash;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.KMAC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes.dex */
public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestParallelHash extends BCMessageDigest implements Cloneable {
        public DigestParallelHash(int i10, int i11) {
            super(new ParallelHash(i10, null, 128, i11));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new ParallelHash((ParallelHash) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestParallelHash128_256 extends DigestParallelHash {
        public DigestParallelHash128_256() {
            super(128, 256);
        }
    }

    public static class DigestParallelHash256_512 extends DigestParallelHash {
        public DigestParallelHash256_512() {
            super(256, 512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i10) {
            super(new SHA3Digest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i10, int i11) {
            super(new SHAKEDigest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHAKEDigest((SHAKEDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public static class DigestTupleHash extends BCMessageDigest implements Cloneable {
        public DigestTupleHash(int i10, int i11) {
            super(new TupleHash(i10, null, i11));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new TupleHash((TupleHash) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestTupleHash128_256 extends DigestTupleHash {
        public DigestTupleHash128_256() {
            super(128, 256);
        }
    }

    public static class DigestTupleHash256_512 extends DigestTupleHash {
        public DigestTupleHash256_512() {
            super(256, 512);
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(BERTags.FLAGS);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i10) {
            super(new HMac(new SHA3Digest(i10)));
        }
    }

    public static class KMac128 extends BaseMac {
        public KMac128() {
            super(new KMAC(128, new byte[0]));
        }
    }

    public static class KMac256 extends BaseMac {
        public KMac256() {
            super(new KMAC(256, new byte[0]));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(BERTags.FLAGS);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i10) {
            super(y.a(i10, "HMACSHA3-"), i10, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            d.b(str, "$Digest512", "MessageDigest.SHA3-512", b.a(str, "$Digest384", "MessageDigest.SHA3-384", b.a(str, "$Digest256", "MessageDigest.SHA3-256", b.a(str, "$Digest224", "MessageDigest.SHA3-224", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            c.b(configurableProvider, str, "$Digest224", "MessageDigest", NISTObjectIdentifiers.id_sha3_224);
            c.b(configurableProvider, str, "$Digest256", "MessageDigest", NISTObjectIdentifiers.id_sha3_256);
            c.b(configurableProvider, str, "$Digest384", "MessageDigest", NISTObjectIdentifiers.id_sha3_384);
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, str + "$Digest512");
            d.b(str, "$DigestShake128_256", "MessageDigest.SHAKE128-256", b.a(str, "$DigestShake256_512", "MessageDigest.SHAKE256-512", new StringBuilder(), configurableProvider), configurableProvider);
            c.b(configurableProvider, str, "$DigestShake256_512", "MessageDigest", NISTObjectIdentifiers.id_shake256);
            c.b(configurableProvider, str, "$DigestShake128_256", "MessageDigest", NISTObjectIdentifiers.id_shake128);
            addHMACAlgorithm(configurableProvider, "SHA3-224", o.a(u.b("Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512", "Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256", configurableProvider), str, "$HashMac224"), k3.a.a(str, "$KeyGenerator224"));
            addHMACAlias(configurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
            addHMACAlgorithm(configurableProvider, "SHA3-256", k3.a.a(str, "$HashMac256"), k3.a.a(str, "$KeyGenerator256"));
            addHMACAlias(configurableProvider, "SHA3-256", NISTObjectIdentifiers.id_hmacWithSHA3_256);
            addHMACAlgorithm(configurableProvider, "SHA3-384", k3.a.a(str, "$HashMac384"), k3.a.a(str, "$KeyGenerator384"));
            addHMACAlias(configurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
            addHMACAlgorithm(configurableProvider, "SHA3-512", k3.a.a(str, "$HashMac512"), k3.a.a(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
            addKMACAlgorithm(configurableProvider, "128", k3.a.a(str, "$KMac128"), k3.a.a(str, "$KeyGenerator256"));
            addKMACAlgorithm(configurableProvider, "256", k3.a.a(str, "$KMac256"), k3.a.a(str, "$KeyGenerator512"));
            configurableProvider.addAlgorithm("MessageDigest.TUPLEHASH256-512", str + "$DigestTupleHash256_512");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            e.b(sb2, "$DigestTupleHash128_256", configurableProvider, "MessageDigest.TUPLEHASH128-256");
            d.b(str, "$DigestParallelHash128_256", "MessageDigest.PARALLELHASH128-256", b.a(str, "$DigestParallelHash256_512", "MessageDigest.PARALLELHASH256-512", u.b("Alg.Alias.MessageDigest.TUPLEHASH256", "TUPLEHASH256-512", "Alg.Alias.MessageDigest.TUPLEHASH128", "TUPLEHASH128-256", configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH256", "PARALLELHASH256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH128", "PARALLELHASH128-256");
        }
    }

    private SHA3() {
    }
}
