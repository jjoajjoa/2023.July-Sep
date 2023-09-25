from django.views.generic import ListView, DetailView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.urls import reverse_lazy
from .models import Book
from .forms import BookForm

# Create your views here.
class BookListView(ListView):
    model = Book
    
class BookDetailView(DetailView):
    model = Book
    
class BookCreateView(CreateView):
    model = Book
    form_class = BookForm
    success_url = reverse_lazy('book-list')
    
class BookUpdateView(UpdateView):
    model = Book
    form_class = BookForm
    template_name_suffix = '_confirm_update'
    success_url = reverse_lazy('book-list')
    
class BookDeleteView(DeleteView):
    model = Book
    success_url = reverse_lazy('book-list')