package com.example.androidpagging.di;

import com.example.androidpagging.data.QuoteAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class RetrofitModule_GetQuoteAPIFactory implements Factory<QuoteAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public RetrofitModule_GetQuoteAPIFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public QuoteAPI get() {
    return getQuoteAPI(retrofitProvider.get());
  }

  public static RetrofitModule_GetQuoteAPIFactory create(Provider<Retrofit> retrofitProvider) {
    return new RetrofitModule_GetQuoteAPIFactory(retrofitProvider);
  }

  public static QuoteAPI getQuoteAPI(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.getQuoteAPI(retrofit));
  }
}
