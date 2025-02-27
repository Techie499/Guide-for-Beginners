from django.urls import path
from . import views

urlpatterns = [
    path("", views.index, name="ShopHome"),
    path('contact/', views.contact,name="ContactUs"),
    path('tracker', views.tracker,name="TrackingStatus"),
    path('search/', views.search,name="Search"),
    path('productview/', views.productView,name="TrackingStatus"),
    path('checkout/', views.checkout,name="Checkout"),
]
